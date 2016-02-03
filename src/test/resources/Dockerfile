FROM jboss/wildfly

#RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent

# Expose the ports we're interested in
EXPOSE 8080 9990

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]







