//drag
		//首先，在鼠标移动进来时要显示该scrolle
		$('.scrollbar').hover(function(){
			$('.scroll').show();
		});
		$('.scroller').on('mousedown',function(e){
			//鼠标按下时，记录鼠标的top值
			var $this = $(this);
			var ctop = $this.position().top; //currentop
			var y = e.clientY;
			//获取scroll向下滚动的最大距离
			var maxHeight = $this.parent('.scroll').height() -  $this.height();
			//获取文本被隐藏内容的高度
			var theight = $('.scrollbar').find('.contenbox').outerHeight();
			var cheight = $this.parent('.scroll').height();
			var sheight = theight - cheight;		
			$(document).on('mousemove',function(e){
				var ntop = e.clientY - y + ctop;
				if(ntop < 0) ntop = 0;
				if(ntop > maxHeight) ntop = maxHeight;	
				var percent = ntop/maxHeight;							
				$this.css({
					top:ntop
				})
				$('.contenbox').css({
					marginTop : -percent*sheight
				})
			}).on('mouseup',function(){
				$(document).off();
			})
		});
		//定义输入框的宽度和高度函数
		function chParaText(a,b){
			var cwidth = a;
			var cheight = b;
			$('.scrollbar').css({
				width : cwidth,
				height : cheight
			})
			
		}
		//定义滚动条的宽度和颜色函数
		function chColor(col,width){
			var col = col;
			var cwidth = width;
			$('.scroll').css({
				width : cwidth,
			})
			$('.scroller').css({
				width : cwidth,
				backgroundColor : col
			})
			
		}
