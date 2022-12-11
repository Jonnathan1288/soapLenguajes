
package sv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sv package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hello_QNAME = new QName("http://sv/", "hello");
    private final static QName _Resta_QNAME = new QName("http://sv/", "resta");
    private final static QName _ValorResultadoResponse_QNAME = new QName("http://sv/", "valorResultadoResponse");
    private final static QName _ParImpar_QNAME = new QName("http://sv/", "par_impar");
    private final static QName _RestaResponse_QNAME = new QName("http://sv/", "restaResponse");
    private final static QName _Potencia_QNAME = new QName("http://sv/", "potencia");
    private final static QName _HelloResponse_QNAME = new QName("http://sv/", "helloResponse");
    private final static QName _PotenciaResponse_QNAME = new QName("http://sv/", "potenciaResponse");
    private final static QName _Diccionario_QNAME = new QName("http://sv/", "diccionario");
    private final static QName _DiccionarioResponse_QNAME = new QName("http://sv/", "diccionarioResponse");
    private final static QName _Login_QNAME = new QName("http://sv/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://sv/", "loginResponse");
    private final static QName _Multiplicacion_QNAME = new QName("http://sv/", "multiplicacion");
    private final static QName _Suma_QNAME = new QName("http://sv/", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://sv/", "sumaResponse");
    private final static QName _ParImparResponse_QNAME = new QName("http://sv/", "par_imparResponse");
    private final static QName _MultiplicacionResponse_QNAME = new QName("http://sv/", "multiplicacionResponse");
    private final static QName _ValorResultado_QNAME = new QName("http://sv/", "valorResultado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link Multiplicacion }
     * 
     */
    public Multiplicacion createMultiplicacion() {
        return new Multiplicacion();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ValorResultado }
     * 
     */
    public ValorResultado createValorResultado() {
        return new ValorResultado();
    }

    /**
     * Create an instance of {@link MultiplicacionResponse }
     * 
     */
    public MultiplicacionResponse createMultiplicacionResponse() {
        return new MultiplicacionResponse();
    }

    /**
     * Create an instance of {@link ParImparResponse }
     * 
     */
    public ParImparResponse createParImparResponse() {
        return new ParImparResponse();
    }

    /**
     * Create an instance of {@link DiccionarioResponse }
     * 
     */
    public DiccionarioResponse createDiccionarioResponse() {
        return new DiccionarioResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Diccionario }
     * 
     */
    public Diccionario createDiccionario() {
        return new Diccionario();
    }

    /**
     * Create an instance of {@link Potencia }
     * 
     */
    public Potencia createPotencia() {
        return new Potencia();
    }

    /**
     * Create an instance of {@link PotenciaResponse }
     * 
     */
    public PotenciaResponse createPotenciaResponse() {
        return new PotenciaResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ValorResultadoResponse }
     * 
     */
    public ValorResultadoResponse createValorResultadoResponse() {
        return new ValorResultadoResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Resta }
     * 
     */
    public Resta createResta() {
        return new Resta();
    }

    /**
     * Create an instance of {@link RestaResponse }
     * 
     */
    public RestaResponse createRestaResponse() {
        return new RestaResponse();
    }

    /**
     * Create an instance of {@link ParImpar }
     * 
     */
    public ParImpar createParImpar() {
        return new ParImpar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "resta")
    public JAXBElement<Resta> createResta(Resta value) {
        return new JAXBElement<Resta>(_Resta_QNAME, Resta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValorResultadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "valorResultadoResponse")
    public JAXBElement<ValorResultadoResponse> createValorResultadoResponse(ValorResultadoResponse value) {
        return new JAXBElement<ValorResultadoResponse>(_ValorResultadoResponse_QNAME, ValorResultadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParImpar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "par_impar")
    public JAXBElement<ParImpar> createParImpar(ParImpar value) {
        return new JAXBElement<ParImpar>(_ParImpar_QNAME, ParImpar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "restaResponse")
    public JAXBElement<RestaResponse> createRestaResponse(RestaResponse value) {
        return new JAXBElement<RestaResponse>(_RestaResponse_QNAME, RestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Potencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "potencia")
    public JAXBElement<Potencia> createPotencia(Potencia value) {
        return new JAXBElement<Potencia>(_Potencia_QNAME, Potencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "potenciaResponse")
    public JAXBElement<PotenciaResponse> createPotenciaResponse(PotenciaResponse value) {
        return new JAXBElement<PotenciaResponse>(_PotenciaResponse_QNAME, PotenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diccionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "diccionario")
    public JAXBElement<Diccionario> createDiccionario(Diccionario value) {
        return new JAXBElement<Diccionario>(_Diccionario_QNAME, Diccionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiccionarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "diccionarioResponse")
    public JAXBElement<DiccionarioResponse> createDiccionarioResponse(DiccionarioResponse value) {
        return new JAXBElement<DiccionarioResponse>(_DiccionarioResponse_QNAME, DiccionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "multiplicacion")
    public JAXBElement<Multiplicacion> createMultiplicacion(Multiplicacion value) {
        return new JAXBElement<Multiplicacion>(_Multiplicacion_QNAME, Multiplicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParImparResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "par_imparResponse")
    public JAXBElement<ParImparResponse> createParImparResponse(ParImparResponse value) {
        return new JAXBElement<ParImparResponse>(_ParImparResponse_QNAME, ParImparResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "multiplicacionResponse")
    public JAXBElement<MultiplicacionResponse> createMultiplicacionResponse(MultiplicacionResponse value) {
        return new JAXBElement<MultiplicacionResponse>(_MultiplicacionResponse_QNAME, MultiplicacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValorResultado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "valorResultado")
    public JAXBElement<ValorResultado> createValorResultado(ValorResultado value) {
        return new JAXBElement<ValorResultado>(_ValorResultado_QNAME, ValorResultado.class, null, value);
    }

}
