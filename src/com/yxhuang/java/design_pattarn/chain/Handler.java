package com.yxhuang.java.design_pattarn.chain;

/**
 *  抽象处理者
 * @author Administrator
 *
 */
public abstract class Handler {

	private Handler nextHandler;
	
	// 每个处理者都必须对请求做出处理
	public final Response handMessage(Request request){
		Response response = null;
		// 判断是否是自己的处理级别
		if (this.getHandlerLevel().equals(request.getRequestLevel())) {
			response = this.echo(request);
		} else {	// 不属于自己的处理级别
			if (nextHandler != null) {
				response = nextHandler.handMessage(request);
			} else {
				// 没有适当的处理者，业务自行处理
			}
		}
		
		return response;
	}
	
	/**
	 *  设置下一个处理者是谁
	 * @param handler
	 */
	public void setNext(Handler handler){
		this.nextHandler = handler;
	}
	
	// 每个处理者都有一个处理级别
	protected abstract Level getHandlerLevel();
	// 每个处理者都必须实现处理任务
	protected abstract Response echo(Request request);
}
