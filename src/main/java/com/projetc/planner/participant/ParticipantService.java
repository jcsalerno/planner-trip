package com.projetc.planner.participant;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetc.planner.trip.Trip;


@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository repository;


    public void registerParticipantsToEvent(List<String> participantsToInvite, Trip trip){
        List<Participant> participants = participantsToInvite.stream().
                map(email -> new Participant(email, trip)).toList();

        this.repository.saveAll(participants);

        System.out.println(participants.getFirst().getId());


    }

    public ParticipantCreateResponse registerParticipantToEvent(String email, Trip trip){
        Participant newParticipant = new Participant(email, trip);
        this.repository.save(newParticipant);

        return new ParticipantCreateResponse(newParticipant.getId());
    }

    // Método para enviar email de confirmação para participantes
    public void triggerConfirmationEmailToParticipants(UUID tripId){
        // Implementação do método
    }

    public void triggerConfirmationEmailToParticipant(String email) {

    }

    public List<ParticipantData> getAllParticipantsFromEvent(UUID tripId){
        return this.repository.findByTripId(tripId).stream().map(participant ->
                new ParticipantData(participant.getId(), participant.getName(), participant.getEmail(),
                        participant.getIsConfirmed())).toList();
    }
}
