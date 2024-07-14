package com.projetc.planner.participant;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class ParticipantService {

    // Método para registrar participantes em um evento
    public void registerParticipantsToEvent(List<String> participantsToInvite, UUID tripID){
        // Implementação do método
    }

    // Método para enviar email de confirmação para participantes
    public void triggerConfirmationEmailToParticipants(UUID tripId){
        // Implementação do método
    }
}
