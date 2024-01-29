package com.xotoboil.springboot.xotoboilspringrest.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    /**
     * Get a person with a version parameter
     * @return Person object V1
     */
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson() {
        return new PersonV1("John Rede");
    }

    /**
     * Get a person with a version parameter
     * @return Person object V2
     */
    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson() {
        return new PersonV2("John", "Rede");
    }

    /**
     * Get a person with parameter in the query
     * @return Person object V1
     */
    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonParameter() {
        return new PersonV1("John Rede");
    }

    /**
     * Get a person with parameter in the query
     * @return Person object V2
     */
    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonParameter() {
        return new PersonV2("John", "Rede");
    }

    /**
     * Get a person with header parameter
     * @return Person object v1
     */
    @GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonHeader() {
        return new PersonV1("John Rede");
    }

    /**
     * Get a person with header parameter
     * @return Person object v2
     */
    @GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonHeader() {
        return new PersonV2("John", "Rede");
    }

}
