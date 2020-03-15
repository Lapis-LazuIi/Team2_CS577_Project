CREATE TABLE agency (
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    name TEXT NOT NULL,
    external_url TEXT NOT NULL)
WITH (OIDS = FALSE);

CREATE TABLE calendar (
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    monday BIT NOT NULL,
    tuesday BIT NOT NULL,
    wednesday BIT NOT NULL,
    thursday BIT NOT NULL,
    friday BIT NOT NULL,
    saturday BIT NOT NULL,
    sunday BIT NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL)
WITH (OIDS = FALSE);

CREATE TABLE route (
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    agency_id BIGINT NOT NULL REFERENCES agency ON DELETE RESTRICT,
    name TEXT NOT NULL,
    route_type SMALLINT NOT NULL,
    external_url TEXT NOT NULL)
WITH (OIDS = FALSE);

CREATE TABLE stop (
    id CHAR(3) PRIMARY KEY,
    name TEXT NOT NULL,
    lat DECIMAL(9,6) NOT NULL,
    lon DECIMAL(9,6) NOT NULL,
    external_url TEXT NOT NULL)
WITH (OIDS = FALSE);

CREATE TABLE trip (
    id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    route_id BIGINT NOT NULL REFERENCES route ON DELETE RESTRICT,
    calendar_id BIGINT NOT NULL REFERENCES calendar ON DELETE RESTRICT,
    headsign TEXT NOT NULL,
    direction BIT NOT NULL,
	avail_seats SMALLINT NOT NULL CHECK (avail_seats >= 0))
WITH (OIDS = FALSE);

CREATE TABLE stop_time (
    stop_id CHAR(3) NOT NULL REFERENCES stop ON DELETE RESTRICT,
    trip_id BIGINT NOT NULL REFERENCES trip ON DELETE RESTRICT,
    stop_sequence INT NOT NULL,
    arrival_time INTERVAL NOT NULL,
    departure_time INTERVAL NOT NULL,
    pickup_type SMALLINT NOT NULL,
    dropoff_type SMALLINT NOT NULL,
    PRIMARY KEY (stop_id, trip_id))
WITH (OIDS = FALSE);

CREATE TABLE ticket_transaction (
	id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
	billing_address TEXT NOT NULL,
	payment_status TEXT NOT NULL,
	payment_method TEXT NOT NULL,
	payment_date TIMESTAMPTZ NOT NULL,)
WITH (OIDS = FALSE);
	
