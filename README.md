# edn2json

`edn2json` reads one EDN per line on STDIN and outputs one JSON per line.

## Usage

    cat *.edn | edn2json > myfile.jsons

## Install

### On macOS with Homebrew

    brew install oscaro/public/edn2json

### From source

    lein clean
    lein uberjar
    echo "#! $(which java) -jar" | cat - target/edn2json-*-standalone.jar > edn2json
    chmod u+x edn2json

Then move the standalone `edn2json` executable somewhere in your `PATH`.

## License

Copyright © 2016-2018 Oscaro
