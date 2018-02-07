# edn2json

`edn2json` reads one EDN per line on STDIN and outputs one JSON per line.

## Usage

    cat *.edn | lein run > myfile.jsons

## Build

    lein uberjar

### Make a standalone `edn2json` executable

    lein clean
    lein uberjar
    echo "#! $(which java) -jar" | cat - target/edn2json-*-standalone.jar > edn2json
    chmod u+x edn2json

## License

Copyright © 2016-2018 Oscaro
