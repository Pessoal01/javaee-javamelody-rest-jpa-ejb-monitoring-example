package ee.mrts.service;

import ee.mrts.model.Speaker;

import javax.ejb.Stateless;
import java.util.Arrays;
import java.util.List;

@Stateless
public class SpeakerServiceImpl implements SpeakerService {

    private static final String VIKTOR_BIO = "Viktor Klang is the Deputy CTO at Lightbend —- problem solver, "
            + "developer, prolific contributor to the Akka project, Akka Tech Lead Emeritus, member of the "
            + "Reactive Streams Special Interest Group and contributor to the Scala Standard Library "
            + "concurrency APIs. Known from places such as, but not limited to, the Internet.";
    private static final String JAROSLAV_BIO = "Jaroslav Tulach is the founder and initial architect of "
            + "NetBeans, which is not just a well known IDE, but also the first modular desktop application "
            + "framework written in Java. I have seen, made and helped to recover from many API design "
            + "mistakes. Such experiences forced me to write a book titled “Practical API Design”. "
            + "These days I am helping OracleLabs to design the API of Truffle which is the fastest "
            + "virtual machine on the planet.";
    private static final String KIRK_BIO = "Kirk works for Kodewerk as a consultant offering Java "
            + "performance-related services and training. He has developed and tuned applications written "
            + "in C/C++, Smalltalk, and a variety of other languages. Kirk has written many articles and "
            + "spoken at several conferences on the subject of performance tuning. He helped evolve "
            + "http://www.javaperformancetuning.com as a resource for performance tuning tips and information. "
            + "Recently he founded jClarity which is focused on building better performance diagnostic tooling.";

    @Override
    public List<Speaker> findAll() {
        return Arrays.asList(new Speaker("Viktor Klang", VIKTOR_BIO, "@viktorklang"),
                new Speaker("Jaroslav Tulach", JAROSLAV_BIO, "@JaroslavTulach"),
                new Speaker("Kirk Pepperdine", KIRK_BIO, "@kcpeppe"));
    }

}
