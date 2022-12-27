package spytech.creator.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import spytech.creator.server.model.Server;

public interface ServerRpo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
