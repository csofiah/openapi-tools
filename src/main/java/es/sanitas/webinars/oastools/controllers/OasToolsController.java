package es.sanitas.webinars.oastools.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.sanitas.webinars.oastools.model.Community;
import es.sanitas.webinars.oastools.model.Province;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*")
@RestController
@Slf4j
public class OasToolsController {

    private static final Province PROVINCE_MADRID = new Province("28", "Madrid", null, null);
    private static final Province PROVINCE_MADRID_EXT = new Province("28", "Madrid", "Madrid", "CAM");
    private static final Community COMMUNITY_MADRID = new Community("CAM", "C. Madrid", null, null, null);
    private static final Community COMMUNITY_MADRID_EXT = new Community("CAM", "C. Madrid",
            "Comunidad Autónoma de Madrid", Arrays.asList("28"), Arrays.asList(PROVINCE_MADRID));

    @GetMapping("/communities")
    public ResponseEntity<List<Community>> findCommunities(
            @RequestParam(value = "name", required = false) String name) {
        return ResponseEntity.ok(Arrays.asList(COMMUNITY_MADRID));
    }

    @GetMapping("/communities/{communityId}")
    public ResponseEntity<Community> getCommunityDetail(@PathVariable("communityId") String communityId) {
        return ResponseEntity.ok(COMMUNITY_MADRID_EXT);
    }

    @PutMapping("/communities/{communityId}")
    public ResponseEntity<Community> createOrReplaceCommunity(@PathVariable("communityId") String communityId,
            @RequestBody Community community) {
        log.debug("Community: {}", community);
        return ResponseEntity.ok(community);
    }

    @DeleteMapping("/communities/{communityId}")
    public ResponseEntity<Void> removeCommunity(@PathVariable("communityId") String communityId) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/provinces")
    public ResponseEntity<List<Province>> findProvinces(@RequestParam(value = "name", required = false) String name) {
        return ResponseEntity.ok(Arrays.asList(PROVINCE_MADRID));
    }

    @GetMapping("/provinces/{provinceId}")
    public ResponseEntity<Province> getProvinceDetail(@PathVariable("provinceId") String provinceId) {
        return ResponseEntity.ok(PROVINCE_MADRID_EXT);
    }

    @PutMapping("/provinces/{provinceId}")
    public ResponseEntity<Province> createOrReplaceProvince(@PathVariable("provinceId") String provinceId,
            @RequestBody Province province) {
        log.debug("Province: {}", province);
        return ResponseEntity.ok(province);
    }

    @DeleteMapping("/provinces/{provinceId}")
    public ResponseEntity<Void> removeProvince(@PathVariable("provinceId") String provinceId) {
        return ResponseEntity.noContent().build();
    }

}
