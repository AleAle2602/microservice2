package com.microservice.devices.client.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "msvc-Permission", url = "localhost:9090/api/permissions")
public interface PermissionClient {
    @GetMapping("/search-by-owner/{idOwner}")
    Long getCodeByOwnerId(@PathVariable Long idOwner);
}
