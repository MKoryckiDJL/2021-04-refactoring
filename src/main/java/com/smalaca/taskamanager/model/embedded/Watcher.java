package com.smalaca.taskamanager.model.embedded;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Watcher {
    private String firstName;
    private String lastName;
    @Embedded
    private PhoneNumber phoneNumber;
    @Embedded
    private EmailAddress emailAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Watcher watcher = (Watcher) o;

        return new EqualsBuilder()
                .append(firstName, watcher.firstName)
                .append(lastName, watcher.lastName)
                .append(phoneNumber, watcher.phoneNumber)
                .append(emailAddress, watcher.emailAddress)
                .isEquals();
    }

    @Override
    @SuppressWarnings("MagicNumber")
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(firstName)
                .append(lastName)
                .append(phoneNumber)
                .append(emailAddress)
                .toHashCode();
    }
}
