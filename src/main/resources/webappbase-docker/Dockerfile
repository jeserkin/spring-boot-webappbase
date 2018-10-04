FROM postgres:9.6-alpine
RUN apk update
RUN apk add openssl
RUN apk add -U tzdata
# Set own timezone if required
RUN cp /usr/share/zoneinfo/Europe/Tallinn /etc/localtime
