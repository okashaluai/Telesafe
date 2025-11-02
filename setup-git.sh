#!/bin/bash

git remote remove origin
git remote add origin git@github.com:okashaluai/Telesafe.git

# Main Repository
git remote set-url --add --push origin git@github.com:okashaluai/Telesafe.git

# Mirror Repository
git remote set-url --add --push origin git@git-iit.fh-joanneum.at:e08l64/Telesafe.git

git fetch

git remote -v
