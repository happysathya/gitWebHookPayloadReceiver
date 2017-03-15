package com.happysathya.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "content_type",
        "insecure_ssl",
        "url"
})
public class Config {

    @JsonProperty("content_type")
    private String contentType;
    @JsonProperty("insecure_ssl")
    private String insecureSsl;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("content_type")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("content_type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("insecure_ssl")
    public String getInsecureSsl() {
        return insecureSsl;
    }

    @JsonProperty("insecure_ssl")
    public void setInsecureSsl(String insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
