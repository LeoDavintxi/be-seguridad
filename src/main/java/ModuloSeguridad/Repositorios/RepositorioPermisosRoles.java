package ModuloSeguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import ModuloSeguridad.Modelos.PermisosRoles;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles, String> {
}
