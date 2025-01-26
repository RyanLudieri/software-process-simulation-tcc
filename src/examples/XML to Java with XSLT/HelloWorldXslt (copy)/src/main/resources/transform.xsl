<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text" encoding="UTF-8" indent="yes"/>

    <!-- Template principal que aplica a transformação -->
    <xsl:template match="/class">
        <xsl:text>package unifal.edu.br;&#10;</xsl:text>
        <xsl:text>public class</xsl:text><xsl:text> </xsl:text><xsl:value-of select="@name"/> {
        <xsl:text>&#10;</xsl:text>

        <xsl:apply-templates select="attribute"/>

        <xsl:text>}</xsl:text>
    </xsl:template>

    <!-- Template para gerar os atributos e métodos -->
    <xsl:template match="attribute">
        <xsl:text>    </xsl:text>private <xsl:value-of select="@type"/> <xsl:text> </xsl:text><xsl:value-of select="@name"/>;<xsl:text>&#10;&#10;</xsl:text>

        <!-- Gerar getter -->
        <xsl:text>    </xsl:text>public <xsl:value-of select="@type"/> get<xsl:value-of select="translate(substring(@name, 1, 1), 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')"/>
        <xsl:value-of select="substring(@name, 2)"/>() {
        <xsl:text>&#10;        </xsl:text>return <xsl:value-of select="@name"/><xsl:text>;</xsl:text>
        <xsl:text>&#10;    </xsl:text>}
        <xsl:text>&#10;&#10;</xsl:text>

        <!-- Gerar setter -->
        <xsl:text>    </xsl:text>public void set<xsl:value-of select="translate(substring(@name, 1, 1), 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')"/>
        <xsl:value-of select="substring(@name, 2)"/>(<xsl:value-of select="@type"/> <xsl:text> </xsl:text><xsl:value-of select="@name"/>) {
        <xsl:text>&#10;        </xsl:text>this.<xsl:value-of select="@name"/> = <xsl:value-of select="@name"/>;<xsl:text>;</xsl:text>
        <xsl:text>&#10;    </xsl:text>}
        <xsl:text>&#10;&#10;</xsl:text>
    </xsl:template>
</xsl:stylesheet>
