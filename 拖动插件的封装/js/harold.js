//采用$.fn形式封装插件
			(function($){
				//插件名称
				$.fn.harold_drag = function(options){
					
					$(this).on('mousedown',function(e){
						$this = $(this);
					var x = e.clientX;
					var y = e.clientY;	
					var ox = $(this).offset().left;
					var oy = $(this).offset().top;
					$(document).on('mousemove',function(e){
					var nx = e.clientX;
					var ny = e.clientY;
					$this.css({
						top : ny - (y -oy),
						left : nx - (x -ox)
					});
					
					}).on('mouseup',function(e){
						$(document).off();
				});
			});
				};
			})(jQuery);
			
