package io.grpc.grpcswagger.openapi.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import lombok.Data;

/**
 * @author liuzhengyang
 */
@Data
public class SwaggerV2Documentation {
    private String swagger = "2.0"; // MAGIC
    private InfoObject info;
    private List<String> produces = Collections.singletonList("application/json");
    private List<String> consumes = Collections.singletonList("application/json");
    private String basePath = "/";
    private String host = "localhost:8088";
    // 支持http, https选择
    private List<String> schemes = new ArrayList<String>(2){{add("http");add("https");}};
    private Map<String, DefinitionType> definitions;
    private Map<String, PathItem> paths;
}
