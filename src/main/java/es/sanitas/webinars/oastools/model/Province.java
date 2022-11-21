package es.sanitas.webinars.oastools.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Province {

    private String provinceId;
    private String name;
    private String longName;
    private String communityId;

}
