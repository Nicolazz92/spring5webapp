package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PuslisherBootstrup implements CommandLineRunner {

    private PublisherRepository publisherRepository;

    @Override
    public void run(String... strings) {
        Publisher pub1 = new Publisher("PubName", "PubAddress");
        publisherRepository.save(pub1);
        System.out.println("publishers count: " + publisherRepository.count());
    }

    @Autowired
    public void setPublisherRepository(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }
}
