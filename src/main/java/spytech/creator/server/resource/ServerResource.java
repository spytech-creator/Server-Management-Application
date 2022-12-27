package spytech.creator.server.resource;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spytech.creator.server.model.Response;
import spytech.creator.server.service.implementation.ServerServiceImpl;

@RestController
@RequestMapping("/server")
@RequiredArgsConstructor
public class ServerResource {
    private final ServerServiceImpl serverService;

}
