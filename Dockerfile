FROM fedora:latest

RUN dnf install -y java-latest-openjdk-devel git && dnf clean all

RUN git config --global user.email "amarieiserban2@gmail.com" && \
    git config --global user.name "Serban Amariei-Hondrea"

WORKDIR /app
CMD ["/bin/bash"]
