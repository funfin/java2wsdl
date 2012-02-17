
package pl.pkarpik.service;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author pkarpik
 */
@WebService(targetNamespace="http://service.pkarpik.pl")
public interface Hello {
    
    String sayHello(@WebParam(name = "person")Person person);
    
}
