package io.grpc.grpcswagger.service;

import io.grpc.grpcswagger.openapi.v2.DocumentRegistry;
import io.grpc.grpcswagger.openapi.v2.SwaggerV2Documentation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

/**
 * swagger doc api
 * @author liuzhengyang
 */
@Service
public class DocumentService {

    public SwaggerV2Documentation getDocumentation(String service, String apiHost, String scheme) {
        SwaggerV2Documentation swaggerV2Documentation = DocumentRegistry.getInstance().get(service);
        if (swaggerV2Documentation != null) {
            swaggerV2Documentation.setHost(apiHost);
        }
        if ("https".equals(scheme)) {
            swaggerV2Documentation.setSchemes(Collections.singletonList("https"));
        }
        return swaggerV2Documentation;
    }
}
