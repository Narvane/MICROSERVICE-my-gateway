package com.narvane.mygateway.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "my-routes")
public class RoutesProperties {
    private String urlMySchool;
    private String urlMyUser;
    private String urlMyReport;
}
