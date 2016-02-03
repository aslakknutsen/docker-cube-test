package org.test;

import java.io.FileNotFoundException;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class TestIT {

	@Deployment
	public static Archive<?> deploy() throws FileNotFoundException {

		WebArchive archive = ShrinkWrap.create(WebArchive.class, "test.war");

		System.out.println(archive.toString(true));

		return archive;
	}

	@Test
	public void doTest() {
		assert (true);
	}
}
