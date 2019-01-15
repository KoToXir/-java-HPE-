package object.interfacets.test3;

public class FireProofDoor extends Door implements FireSafe {

	@Override
	public void fireProof() {
		// TODO 自动生成的方法存根
		System.out.println("这哥们防火");
	}

	@Override
	public void open() {
		// TODO 自动生成的方法存根
		System.out.println("防火门开");
	}

	@Override
	public void close() {
		// TODO 自动生成的方法存根
		System.out.println("防火门关");
	}

}
