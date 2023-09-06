#!/bin/bash

docker run -d -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -v ~/.volume/cdc2:/var/lib/mysql mysql:8