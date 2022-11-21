package es.sanitas.webinars.oastools.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Community {
    
    private String communityId;
    private String name;
    private String longName;
    private List<String> provinceIds;
    private List<Province> provinces;

}
