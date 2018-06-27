# Booking API App

# Assumptions

* A user can have one or more bookings
* A booking must be linked to only one user
* An itenary can only be linked to a single booking

## Expectations
* Gets all the bookings for a single user

* Get a single booking given a bookingId

* Get all the bookings but limit the number of bookings returned

* Get a user given a bookingId

* Get an itenary for a user given a bookingId

# API

GET /bookings/users/{id}

GET /bookings/{id}

GET bookings/(?limit)

GET /bookings/{id}/user

GET /bookings/{id}/Itenary

I ran tests on the API using postman. I usually write automated tests using restassured library, cucumber and junit. Something similar to what I did her: https://github.com/ezeio/MessageAPI
