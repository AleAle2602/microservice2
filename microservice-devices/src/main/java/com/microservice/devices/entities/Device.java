package com.microservice.devices.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Entity
@Table(name = "tc_devices")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "calendar_id", nullable = false)
    private long calendarId;

    @Getter
    @Setter
    @Column(name = "device_name")
    @JsonProperty("device_name")
    private String deviceName;

    @Getter
    @Setter
    @Column(name = "status")
    @JsonProperty("status")
    private String status;

    @Getter
    @Setter
    @Column(name = "last_update")
    @JsonProperty("last_update")
    private Date lastUpdate;

    @Getter
    @Setter
    @Column(name = "position_id")
    @JsonProperty("position_id")
    private long positionId;

    @Getter
    @Setter
    @Column(name = "phone")
    @JsonProperty("phone")
    private String phone;

    @Getter
    @Setter
    @Column(name = "model")
    @JsonProperty("model")
    private String model;

    @Getter
    @Setter
    @Column(name = "contact")
    @JsonProperty("contact")
    private String contact;

    @Getter
    @Setter
    @Column(name = "category")
    @JsonProperty("category")
    private String category;

    @Getter
    @Setter
    @Column(name = "disabled")
    @JsonProperty("disabled")
    private boolean disabled;

    @Getter
    @Setter
    @Column(name = "expiration_time")
    @JsonProperty("expiration_time")
    private Date expirationTime;

    @Getter
    @Setter
    @Column(name = "motion_streak")
    @JsonProperty("motion_streak")
    private boolean motion_streak;

    @Getter
    @Setter
    @Column(name = "motion_state")
    @JsonProperty("motion_state")
    private boolean motionState;

    @Getter
    @Setter
    @Column(name = "motion_time")
    @JsonProperty("motion_time")
    private Date motionTime;

    @Getter
    @Setter
    @Column(name = "motion_distance")
    @JsonProperty("motion_distance")
    private double motionDistance;

    @Getter
    @Setter
    @Column(name = "overspeed_state")
    @JsonProperty("overspeed_state")
    private boolean overspeedState;

    @Getter
    @Setter
    @Column(name = "overspeed_time")
    @JsonProperty("overspeed_time")
    private Date overspeedTime;

    @Getter
    @Setter
    @Column(name = "overspeed_geofenceId")
    @JsonProperty("overspeed_geofenceId")
    private long overspeedGeofenceId;

}
