package srivatsan.studentapi.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "school")
public class School {
    private String schoolId;
    private String schoolName;
    private String schoolRegion;
}
