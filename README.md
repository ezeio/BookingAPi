# Booking API App

# Assumptions

* A user can have one or more bookings
* A booking must be linked to only one user
* An itenary can only be linked to a single booking

## Expectations
* Gets all the bookings for a single user
* Get all the bookings but limit the number of bookings returned
* Get a single booking given a userId and bookingId
* Get an itenary for a user given a userId and bookingId

# API

GET /bookings/users/{id}

GET /bookings/{id}

GET bookings/(?limit)

GET /bookings/{id}/user

GET /bookings/{id}/Itenary
