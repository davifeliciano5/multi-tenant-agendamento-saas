package com.davi.saas.agendamento.infra.security;

import com.davi.saas.agendamento.auth.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
