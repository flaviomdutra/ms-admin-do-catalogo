package com.fullcycle.admin.catalogo.infrastructure.api.controllers;

import com.fullcycle.admin.catalogo.domain.pagination.Pagination;
import com.fullcycle.admin.catalogo.infrastructure.api.CastMemberAPI;
import com.fullcycle.admin.catalogo.infrastructure.castmember.models.CastMemberListResponse;
import com.fullcycle.admin.catalogo.infrastructure.castmember.models.CastMemberResponse;
import com.fullcycle.admin.catalogo.infrastructure.castmember.models.CreateCastMemberRequest;
import com.fullcycle.admin.catalogo.infrastructure.castmember.models.UpdateCastMemberRequest;
import org.springframework.http.ResponseEntity;

public class CastMemberController implements CastMemberAPI {
    @Override
    public ResponseEntity<?> create(CreateCastMemberRequest input) {
        return null;
    }

    @Override
    public Pagination<CastMemberListResponse> list(String search, int page, int perPage, String sort, String direction) {
        return null;
    }

    @Override
    public CastMemberResponse getById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateById(String id, UpdateCastMemberRequest aBody) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
