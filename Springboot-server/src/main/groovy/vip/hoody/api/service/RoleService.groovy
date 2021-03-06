package vip.hoody.api.service


import vip.hoody.api.domain.UserRole
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import vip.hoody.api.domain.User
import vip.hoody.api.repository.UserRoleRepository

@Service
class RoleService {

    @Autowired
    UserRoleRepository userRoleRepository

    Set<String> getRolesByUserId(User user) {
        List<UserRole> userRoleList = userRoleRepository.findAllByUser(user)
        //获取角色信息
        Set<String> roles = userRoleList.role.toSet()
        return roles
    }
}
