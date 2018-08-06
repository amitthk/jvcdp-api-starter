FROM fabric8/java-alpine-openjdk8-jdk:1.3.1
MAINTAINER amitthk

ARG api_version
ARG env_profiles
ENV env_profiles=$env_profiles
ENV api_name blogposts
ENV api_version=$api_version
ENV jar_location ./target

RUN echo "==> Running:"  ${api_name}-${api_version}
ADD ${jar_location}/${api_name}${api_version}.jar /deployments/${api_name}.jar
CMD chmod 775 /deployments/${api_name}.jar && java -jar -Dspring.profiles.active=${env_profiles} /deployments/${api_name}.jar

EXPOSE 8080
