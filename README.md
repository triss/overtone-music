# music

A Clojure library with functions and data representing general musical
knowledge, like scales, chords, intervals, etc.

## Rationale

When writing music software it's often useful to have representations of
scales, chords and notes around and a means of managing them.
The Overtone library provided these representations in `overtone.music` but did
not make them availiable to ClojureScript users.
This repository contains the same representations that can be used from either
Clojure or ClojureScript and without the need to pull in such a large library
as a dependancy.

## Usage

Add `[org.clojars.triss/music "0.1.0-SNAPSHOT"]` to `project.clj`
`:dependancies` and require the namespace as neccesary.
