package com.fullcycle.admin.catalogo.application.castmember.udpate;

import com.fullcycle.admin.catalogo.application.UseCase;

public sealed abstract class UpdateCastMemberUseCase
        extends UseCase<UpdateCastMemberCommand, UpdateCastMemberOutput>
        permits DefaultUpdateCastMemberUseCase {
}
