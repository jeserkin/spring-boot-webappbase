FROM postgres:9.3-alpine
RUN apk update
RUN apk add openssl
apk add -U tzdata
# Set own timezone if required
cp /usr/share/zoneinfo/Europe/Tallinn /etc/localtime