package ir.isc.cif.api;

import ir.isc.cif.dto.Role;

public interface RoleService {
    Role findByName(String name);

    boolean exists(String name);
}
