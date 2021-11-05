package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-05T14:54:53.857083+08:00[Asia/Manila]")
@Controller
@RequestMapping("${openapi.curexrateGateway.base-path:/v1}")
public class ExchangeRateApiController implements ExchangeRateApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ExchangeRateApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
