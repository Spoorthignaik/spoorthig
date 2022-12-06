package com.xworkz.examples;

import java.awt.AWTError;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.image.ImagingOpException;
import java.awt.print.PrinterException;
import java.beans.IntrospectionException;
import java.beans.PropertyVetoException;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.UnmodifiableModuleException;
import java.lang.invoke.LambdaConversionException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.module.FindException;
import java.lang.module.InvalidModuleDescriptorException;
import java.lang.module.ResolutionException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InaccessibleObjectException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import java.text.ParseException;
import java.util.ConcurrentModificationException;
import java.util.DuplicateFormatFlagsException;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.jar.JarException;

import java.util.zip.DataFormatException;
import java.util.zip.ZipError;

import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.MirroredTypesException;
import javax.management.BadStringOperationException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.print.PrintException;
import javax.print.attribute.UnmodifiableSetException;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.RefreshFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.xpath.XPathException;


import org.w3c.dom.ls.LSException;
import org.w3c.dom.ranges.RangeException;

public class ExceptionCreate {
	
	
	// run time exception
	
	public void method1() {
		System.out.println("running method 1");
		throw new RuntimeException();
	}
	
	
	public void method2() {
		System.out.println("running method 2");
		throw new AnnotationTypeMismatchException(null,null);
	}
	
	public void method3() {
		System.out.println("running method 3");
		throw new  ArithmeticException();
	}
	
	public void method4() {
		System.out.println("running method 4");
		throw new ArrayStoreException();
	}
	
	public void method5() {
		System.out.println("running method 5");
		throw new 	BufferOverflowException();
	}
	
	public void method6() {
		System.out.println("running method 6");
		throw new BufferUnderflowException ();
	}
	
	public void method7() {
		System.out.println("running method 7");
		throw new ClassCastException ();
	}
	
	public void method8() {
		System.out.println("running method 8");
		throw new ConcurrentModificationException ();
	}
	
	public void method9() {
		System.out.println("running method 9");
		throw new EmptyStackException ();
	}
	
	public void method10() {
		System.out.println("running method 10");
		throw new EnumConstantNotPresentException(null, null);
	}
	
	public void method11() {
		System.out.println("running method 11");
		throw new FileSystemAlreadyExistsException();
	}
	
	
	public void method12() {
		System.out.println("running method 12");
		throw new FileSystemNotFoundException();
	}
	
	
	public void method13() {
		System.out.println("running method 13");
		throw new FindException();
	}
	
	public void method14() {
		System.out.println("running method 14");
		throw new IllegalArgumentException();
	}
	
	
	public void method15() {
		System.out.println("running method 15");
		throw new IllegalCallerException();
	}
	
	
	
	public void method16() {
		System.out.println("running method 16");
		throw new InaccessibleObjectException();
	}
	
	
	
	public void method17() {
		System.out.println("running method 17");
		throw new IncompleteAnnotationException(null, null);
	}
	
	
	
	public void method18() {
		System.out.println("running method 18");
		throw new UnsupportedOperationException();
	}
	
	
	public void method19() {
		System.out.println("running method 19");
		throw new WrongMethodTypeException();
	}
	
	
	public void method20() {
		System.out.println("running method 20");
		throw new UnmodifiableSetException();
	}
	
	
	public void method21() {
		System.out.println("running method 21");
		throw new SecurityException();
	}
	
	
	public void method22() {
		System.out.println("running method 22");
		throw new ResolutionException();
	}
	
	
	public void method23() {
		System.out.println("running method 23");
		throw new ProviderException();
	}
	
	
	public void method24() {
		System.out.println("running method 24");
		throw new ProviderNotFoundException();
	}
	
	
	public void method25() {
		System.out.println("running method 25");
		throw new NullPointerException();
	}
	
	
	
	public void method26() {
		System.out.println("running method 26");
		throw new NoSuchElementException();
	}
	
	
	
	public void method27() {
		System.out.println("running method 27");
		throw new NegativeArraySizeException();
	}
	
	
	
	public void method28() {
		System.out.println("running method 28");
		throw new MissingResourceException(null, null, null);
	}
	
	
	public void method29() {
		System.out.println("running method 29");
		throw new MalformedParameterizedTypeException();
	}
	
	
	public void method30() {
		System.out.println("running method 30");
		throw new LayerInstantiationException();
	}
	
	
	public void method31() {
		System.out.println("running method 31");
		throw new InvalidModuleDescriptorException();
	}
	
	
	public void method32() {
		System.out.println("running method 32");
		throw new IndexOutOfBoundsException();
	}
	
	
	public void method33() {
		System.out.println("running method 33");
		throw new DuplicateFormatFlagsException(null);
	}
	
	
	public void method34() {
		System.out.println("running method 34");
		throw new ImagingOpException(null);
	}
	
	
	public void method35() {
		System.out.println("running method 35");
		throw new JarException();
	}
	
	
	//exception
	
	public void method36() throws AlreadyBoundException {
		System.out.println("running method 36");
		throw new AlreadyBoundException();
	}
	
	public void method37() throws BrokenBarrierException {
		System.out.println("running method 37");
		throw new BrokenBarrierException();
	}
	
	public void method38() throws AlreadyBoundException {
		System.out.println("running method 38");
		throw new AlreadyBoundException ();
	}
	
	public void method39() throws BadLocationException {
		System.out.println("running method 39");
		throw new BadLocationException (null, 0);
	}
	
	
	public void method40() throws CertificateException {
		System.out.println("running method 40");
		throw new CertificateException ();
	}
	
	
	public void method41() throws CloneNotSupportedException {
		System.out.println("running method 41");
		throw new CloneNotSupportedException ();
	}
	
	
	public void method42() throws DataFormatException {
		System.out.println("running method 42");
		throw new DataFormatException();
	}
	
	
	public void method43() throws DatatypeConfigurationException {
		System.out.println("running method 43");
		throw new DatatypeConfigurationException ();
	}
	
	
	public void method44() throws DestroyFailedException {
		System.out.println("running method 44");
		throw new DestroyFailedException ();
	}
	
	public void method45() throws ExecutionException {
		System.out.println("running method 45");
		throw new ExecutionException(null) ;
	}
	
	public void method46() throws ExpandVetoException {
		System.out.println("running method 46");
		throw new ExpandVetoException(null) ;
	}
	
	
	public void method47() throws FontFormatException {
		System.out.println("running method 47");
		throw new FontFormatException(null);
	}
	
	
	public void method48() throws GeneralSecurityException {
		System.out.println("running method 48");
		throw new GeneralSecurityException();
	}
	
	
	public void method49() throws InterruptedException {
		System.out.println("running method 49");
		throw new InterruptedException();
	}
	
	
	public void method50() throws IntrospectionException {
		System.out.println("running method 50");
		throw new IntrospectionException (null);
	}
	
	
	public void method51() throws InvalidApplicationException {
		System.out.println("running method 51");
		throw new InvalidApplicationException(getClass());
	}
	
	
	public void method52() throws InvalidMidiDataException {
		System.out.println("running method 52");
		throw new InvalidMidiDataException();
	}
	
	
	public void method53() throws InvalidTargetObjectTypeException {
		System.out.println("running method 53");
		throw new InvalidTargetObjectTypeException ();
	}
	
	
	public void method54() throws IOException {
		System.out.println("running method 54");
		throw new IOException ();
	}
	
	
	public void method55() throws JMException {
		System.out.println("running method 55");
		throw new JMException  ();
	}
	
	
	public void method56() throws LambdaConversionException {
		System.out.println("running method 56");
		throw new LambdaConversionException ();
	}
	
	
	public void method57() throws LineUnavailableException {
		System.out.println("running method 57");
		throw new LineUnavailableException();
	}
	
	
	public void method58() throws MarshalException {
		System.out.println("running method 58");
		throw new MarshalException(null);
	}
	
	
	public void method59() throws MidiUnavailableException {
		System.out.println("running method 59");
		throw new MidiUnavailableException();
	}
	
	
	public void method60() throws MimeTypeParseException {
		System.out.println("running method 60");
		throw new MimeTypeParseException();
	}
	
	
	public void method61() throws NoninvertibleTransformException {
		System.out.println("running method 61");
		throw new NoninvertibleTransformException(null);
	}
	
	
	public void method62() throws NotBoundException {
		System.out.println("running method 62");
		throw new NotBoundException ();
	}
	
	
	public void method63() throws ParseException {
		System.out.println("running method 63");
		throw new ParseException (null, 0);
	}
	
	
	public void method64() throws ParserConfigurationException {
		System.out.println("running method 64");
		throw new ParserConfigurationException ();
	}
	
	
	public void method65() throws PrinterException {
		System.out.println("running method 65");
		throw new  PrinterException();
	}
	
	
	public void method66() throws PrintException {
		System.out.println("running method 66");
		throw new PrintException();
	}
	
	
	public void method67() throws PrivilegedActionException {
		System.out.println("running method 67");
		throw new PrivilegedActionException (null);
	}
	
	
	public void method68() throws PropertyVetoException{
		System.out.println("running method 68");
		throw new PropertyVetoException (null, null);
	}
	
	
	public void method69() throws RefreshFailedException {
		System.out.println("running method 69");
		throw new RefreshFailedException ();
	}
	
	
	public void method70() throws RuntimeException {
		System.out.println("running method 70");
		throw new RuntimeException ();
	}
	
	
     // errors	
	
	public void method71() throws AnnotationFormatError {
		System.out.println("Running method 71");
		throw new AnnotationFormatError(null, null);
	}

	public void method72() throws AssertionError {
		System.out.println("Running method  72");
		throw new AssertionError();
	}

	public void method73() throws AWTError {
		System.out.println("Running method 73");
		throw new AWTError(null);
	}

	public void method74() throws CoderMalfunctionError {
		System.out.println("Running method 74");
		throw new CoderMalfunctionError(null);
	}

	public void method75() throws FactoryConfigurationError {
		System.out.println("Running method 75");
		throw new FactoryConfigurationError();
	}

	public void method76() throws FactoryConfigurationError {
		System.out.println("Running method 76");
		throw new FactoryConfigurationError(null, null);
	}

	public void method77() throws IOError {
		System.out.println("Running method 77");
		throw new IOError(null);
	}

	public void method78() throws LinkageError {
		System.out.println("Running method 78");
		throw new LinkageError();
	}

	public void method79() throws ServiceConfigurationError {
		System.out.println("Running method 79");
		throw new ServiceConfigurationError(null);
	}

	public void method80() throws ThreadDeath {
		System.out.println("Running method 80");
		throw new ThreadDeath();
	}

	public void method81() throws TransformerFactoryConfigurationError {
		System.out.println("Running method 81");
		throw new TransformerFactoryConfigurationError();
	}

	public void method82() throws VirtualMachineError {
		System.out.println("Running method82");
		throw new VirtualMachineError() {
			private static final long serialVersionUID = 1L;
		};
	}

	public void method83() throws InternalError {
		System.out.println("Running method 83");
		throw new InternalError();
	}

	public void method84() throws ZipError {
		System.out.println("Running method 84");
		throw new ZipError(null);
	}

	public void method85() throws OutOfMemoryError {
		System.out.println("Running method 85");
		throw new OutOfMemoryError();
	}

	public void method86() throws StackOverflowError {
		System.out.println("Running method 86");
		throw new StackOverflowError();
	}

	public void method87() throws UnknownError {
		System.out.println("Running method 87");
		throw new UnknownError();
	}
	
	public void method88() throws BootstrapMethodError {
		System.out.println("Running method 88");
		throw new BootstrapMethodError();
	}
	
	public void method89() throws  ClassCircularityError {
		System.out.println("Running method 89");
		throw new  ClassCircularityError();
	}
	
	public void method90() throws ClassFormatError {
		System.out.println("Running method 90");
		throw new ClassFormatError();
	}
	
	public void method91() throws  ExceptionInInitializerError {
		System.out.println("Running method 91");
		throw new  ExceptionInInitializerError();
	}
	
	public void method92() throws  IncompatibleClassChangeError {
		System.out.println("Running method 92");
		throw new  IncompatibleClassChangeError();
	}
	
	public void method93() throws  NoClassDefFoundError {
		System.out.println("Running method 93");
		throw new  NoClassDefFoundError();
	}
	
	public void method94() throws  UnsatisfiedLinkError {
		System.out.println("Running method 94");
		throw new  UnsatisfiedLinkError();
	}
	
	public void method95() throws   VerifyError {
		System.out.println("Running method 95");
		throw new   VerifyError();
	}
	
	public void method96() throws  GenericSignatureFormatError {
		System.out.println("Running method 96");
		throw new  GenericSignatureFormatError();
	}
	
	public void method97() throws  UnsupportedClassVersionError {
		System.out.println("Running method 97");
		throw new  UnsupportedClassVersionError();
	}
	
	public void method98() throws  AbstractMethodError {
		System.out.println("Running method 98");
		throw new  AbstractMethodError();
	}
	
	public void method99() throws  IllegalAccessError {
		System.out.println("Running method 99");
		throw new  IllegalAccessError();
	}
	
	public void method100()  {
		System.out.println("Running method 100");
		throw new  NoSuchMethodError();
	}
	
	
	
	
	
	
	

}
