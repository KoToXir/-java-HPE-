package object.interfacets.test3;

public class BulletProofDoor extends Door implements BulletSafe {

	@Override
	public void bulletProof() {
		// TODO 自动生成的方法存根
		System.out.println("这哥们防弹");
	}

	@Override
	public void open() {
		// TODO 自动生成的方法存根
		System.out.println("防弹门开");
	}

	@Override
	public void close() {
		// TODO 自动生成的方法存根
		System.out.println("防弹门关");
	}

}
