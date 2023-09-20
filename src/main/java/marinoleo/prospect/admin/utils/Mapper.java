package marinoleo.prospect.admin.utils;

import marinoleo.prospect.admin.entities.meetings.MeetingEntity;
import marinoleo.prospect.admin.entities.payment.PaymentEntity;
import marinoleo.prospect.admin.entities.prospectors.ProspectorEntity;
import marinoleo.prospect.admin.entities.prospectors.ProspectorLevelEntity;
import marinoleo.prospect.admin.model.Meeting;
import marinoleo.prospect.admin.model.Payment;
import marinoleo.prospect.admin.model.Prospector;
import marinoleo.prospect.admin.model.ProspectorLevel;

public class Mapper {
    public static ProspectorEntity prospectorToProspectorEntity(Prospector prospector) {
        ProspectorEntity prospectorEntity = new ProspectorEntity();
        if (prospector.getId() != null)
            prospectorEntity.setId(prospector.getId());
        if (prospector.getBalance() != null)
            prospectorEntity.setBalance(prospector.getBalance());
        if (prospector.getLastName() != null)
            prospectorEntity.setLastName(prospector.getLastName());
        if (prospector.getMail() != null)
            prospectorEntity.setMail(prospector.getMail());
        if (prospector.getName() != null)
            prospectorEntity.setName(prospector.getName());
        if (prospector.getLinkedin() != null)
            prospectorEntity.setLinkedin(prospector.getLinkedin());
        if (prospector.getPhone() != null)
            prospectorEntity.setPhone(prospector.getPhone());
        if (prospector.getCountry() != null)
            prospectorEntity.setCountry(prospector.getCountry());
        if (prospector.getExam() != null)
            prospectorEntity.setExam(prospector.getExam());
        if (prospector.getEnabled() != null)
            prospectorEntity.setEnabled(prospector.getEnabled());
        if (prospector.getLevelId() != null)
            prospectorEntity.setLevelId(prospector.getLevelId());
        return prospectorEntity;
    }

    public static Prospector prospectorEntityToProspector(ProspectorEntity prospectorEntity) {
        Prospector updatedProspector = new Prospector();
        updatedProspector.setId(prospectorEntity.getId());
        updatedProspector.setLastName(prospectorEntity.getLastName());
        updatedProspector.setBalance(prospectorEntity.getBalance());
        updatedProspector.setMail(prospectorEntity.getMail());
        updatedProspector.setName(prospectorEntity.getName());
        updatedProspector.setLinkedin(prospectorEntity.getLinkedin());
        updatedProspector.setPhone(prospectorEntity.getPhone());
        updatedProspector.setCountry(prospectorEntity.getCountry());
        updatedProspector.setExam(prospectorEntity.getExam());
        updatedProspector.setEnabled(prospectorEntity.getEnabled());
        updatedProspector.setLevelId(prospectorEntity.getLevelId());
        return updatedProspector;
    }

    public static ProspectorEntity getUpdatedProspectorEntity(Prospector prospector, ProspectorEntity prospectorEntity) {
        if (prospector.getLastName() != null)
            prospectorEntity.setLastName(prospector.getLastName());
        if (prospector.getMail() != null)
            prospectorEntity.setMail(prospector.getMail());
        if (prospector.getBalance() != null)
            prospectorEntity.setBalance(prospector.getBalance());
        if (prospector.getName() != null)
            prospectorEntity.setName(prospector.getName());
        if (prospector.getLinkedin() != null)
            prospectorEntity.setLinkedin(prospector.getLinkedin());
        if (prospector.getPhone() != null)
            prospectorEntity.setPhone(prospector.getPhone());
        if (prospector.getCountry() != null)
            prospectorEntity.setCountry(prospector.getCountry());
        if (prospector.getExam() != null)
            prospectorEntity.setExam(prospector.getExam());
        if (prospector.getEnabled() != null)
            prospectorEntity.setEnabled(prospector.getEnabled());
        if (prospector.getLevelId() != null)
            prospectorEntity.setLevelId(prospector.getLevelId());
        return prospectorEntity;
    }

    public static MeetingEntity meetingToMeetingEntity(Meeting meeting) {
        MeetingEntity meetingEntity = new MeetingEntity();
        if (meeting.getId() != null) {
            meetingEntity.setId(meeting.getId());
        }
        if (meeting.getMeetDetails() != null) {
            meetingEntity.setMeetDetails(meeting.getMeetDetails());
        }
        if (meeting.getFecha() != null) {
            meetingEntity.setFecha(meeting.getFecha());
        }
        if (meeting.getDuration() != null) {
            meetingEntity.setDuration(meeting.getDuration());
        }
        if (meeting.getMeetStatus() != null) {
            meetingEntity.setMeetStatus(meeting.getMeetStatus());
        }
        if (meeting.getCancelReason() != null) {
            meetingEntity.setCancelReason(meeting.getCancelReason());
        }
        if (meeting.getContactId() != null) {
            meetingEntity.setContactId(meeting.getContactId());
        }
        if (meeting.getUserId() != null) {
            meetingEntity.setUserId(meeting.getUserId());
        }
        if (meeting.getCustomerId() != null) {
            meetingEntity.setCustomerId(meeting.getCustomerId());
        }
        return meetingEntity;
    }

    public static Meeting meetingEntityToMeeting(MeetingEntity meetingEntity) {
        Meeting meeting = new Meeting();
        meeting.setId(meetingEntity.getId());
        meeting.setMeetDetails(meetingEntity.getMeetDetails());
        meeting.setMeetStatus(meetingEntity.getMeetStatus());
        meeting.setFecha(meetingEntity.getFecha());
        meeting.setDuration(meetingEntity.getDuration());
        meeting.setCancelReason(meetingEntity.getCancelReason());
        meeting.setContactId(meetingEntity.getContactId());
        meeting.setUserId(meetingEntity.getUserId());
        meeting.setCustomerId(meetingEntity.getCustomerId());
        return meeting;
    }

    public static MeetingEntity getUpdatedMeeting(MeetingEntity meetingEntity, Meeting meeting) {
        if (meeting.getMeetDetails() != null) {
            meetingEntity.setMeetDetails(meeting.getMeetDetails());
        }
        if (meeting.getFecha() != null) {
            meetingEntity.setFecha(meeting.getFecha());
        }
        if (meeting.getDuration() != null) {
            meetingEntity.setDuration(meeting.getDuration());
        }
        if (meeting.getMeetStatus() != null) {
            meetingEntity.setMeetStatus(meeting.getMeetStatus());
        }
        if (meeting.getCancelReason() != null) {
            meetingEntity.setCancelReason(meeting.getCancelReason());
        }
        if (meeting.getContactId() != null) {
            meetingEntity.setContactId(meeting.getContactId());
        }
        if (meeting.getUserId() != null) {
            meetingEntity.setUserId(meeting.getUserId());
        }
        if (meeting.getCustomerId() != null) {
            meetingEntity.setCustomerId(meeting.getCustomerId());
        }
        return meetingEntity;
    }

    public static ProspectorLevelEntity prospectorLevelToProspectorLevelEntity(ProspectorLevel prospectorLevel) {
        ProspectorLevelEntity prospectorLevelEntity = new ProspectorLevelEntity();
        if (prospectorLevel.getId() != null)
            prospectorLevelEntity.setId(prospectorLevel.getId());
        if (prospectorLevel.getName() != null)
            prospectorLevelEntity.setName(prospectorLevel.getName());
        if (prospectorLevel.getCommission() != null)
            prospectorLevelEntity.setCommission(prospectorLevel.getCommission());
        if (prospectorLevel.getMeetAmount() != null)
            prospectorLevelEntity.setMeetAmount(prospectorLevel.getMeetAmount());
        return prospectorLevelEntity;
    }

    public static ProspectorLevel prospectorLevelEntityToProspectorLevel(ProspectorLevelEntity prospectorLevelEntity) {
        ProspectorLevel prospectorLevel = new ProspectorLevel();
        prospectorLevel.setId(prospectorLevelEntity.getId());
        prospectorLevel.setCommission(prospectorLevelEntity.getCommission());
        prospectorLevel.setMeetAmount(prospectorLevelEntity.getMeetAmount());
        prospectorLevel.setName(prospectorLevelEntity.getName());
        return prospectorLevel;
    }

    public static ProspectorLevelEntity getUpdatedProspectorLevel(ProspectorLevelEntity prospectorLevelEntity, ProspectorLevel prospectorLevel) {
        if (prospectorLevel.getName() != null)
            prospectorLevelEntity.setName(prospectorLevel.getName());
        if (prospectorLevel.getCommission() != null)
            prospectorLevelEntity.setCommission(prospectorLevel.getCommission());
        if (prospectorLevel.getMeetAmount() != null)
            prospectorLevelEntity.setMeetAmount(prospectorLevel.getMeetAmount());
        return prospectorLevelEntity;
    }

    public static PaymentEntity paymentToPaymentEntity(Payment payment) {
        PaymentEntity paymentEntity = new PaymentEntity();
        if (payment.getAmount() != null) {
            paymentEntity.setAmount(payment.getAmount());
        }
        if (payment.getDate() != null) {
            paymentEntity.setDate(payment.getDate());
        }
        if (payment.getId() != null) {
            paymentEntity.setId(payment.getId());
        }
        if (payment.getProspectorId() != null) {
            paymentEntity.setProspectorId(payment.getProspectorId());
        }
        return paymentEntity;
    }

    public static Payment paymentEntityToPayment(PaymentEntity paymentEntity) {
        Payment payment = new Payment();
        payment.setAmount(paymentEntity.getAmount());
        payment.setProspectorId(paymentEntity.getProspectorId());
        payment.setDate(paymentEntity.getDate());
        payment.setId(paymentEntity.getId());
        return payment;
    }

    public static PaymentEntity getUpdatedPaymentEntity(PaymentEntity paymentEntity, Payment payment) {
        if (payment.getAmount() != null) {
            paymentEntity.setAmount(payment.getAmount());
        }
        if (payment.getDate() != null) {
            paymentEntity.setDate(payment.getDate());
        }
        if (payment.getId() != null) {
            paymentEntity.setId(payment.getId());
        }
        if (payment.getProspectorId() != null) {
            paymentEntity.setProspectorId(payment.getProspectorId());
        }
        return paymentEntity;
    }


}
