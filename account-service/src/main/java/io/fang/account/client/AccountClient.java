package io.fang.account.client;

import io.fang.account.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "account-service", url = "account")
public interface AccountClient {

    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
