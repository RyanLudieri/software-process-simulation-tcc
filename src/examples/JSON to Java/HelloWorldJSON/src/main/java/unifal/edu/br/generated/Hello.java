
package unifal.edu.br.generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Root Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "language",
    "message"
})
public class Hello {

    /**
     * The language Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    private String language = "";
    /**
     * The message Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    private String message = "";

    /**
     * The language Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * The language Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * The message Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * The message Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hello.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hello) == false) {
            return false;
        }
        Hello rhs = ((Hello) other);
        return (((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message)))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))));
    }

}
