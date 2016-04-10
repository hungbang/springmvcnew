<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tiles-extra"%>
<div class="primary-sidebar">



	<br>
	<div style="text-align: center;">
		<a href=""><img src="resources/img/school.png"
			style="max-height: 100px; max-width: 100px;"> </a>
	</div>
	<br>
	<ul class="nav nav-collapse collapse nav-collapse-primary">


		<li class="dark-nav"><span class="glow"></span> <a
			href="home.php" rel="tooltip" data-placement="right"
			data-original-title="Dashboard"> <i class="icon-desktop icon-1x"></i>
				<span>Dashboard </span>
		</a></li>
		<li class="dark-nav"><span class="glow"></span> <a
			href="category.php" rel="tooltip" data-placement="right"
			data-original-title="Category"> <i
				class="icon-folder-close icon-1x"></i> <span>Category </span>
		</a></li>
		<li class="dark-nav"><span class="glow"></span> <a
			href="sub_category.php" rel="tooltip" data-placement="right"
			data-original-title="Sub Category"> <i class="icon-tags icon-1x"></i>
				<span>Sub Category </span>
		</a></li>
		<li class="dark-nav"><span class="glow"></span> <a
			href="subject.php" rel="tooltip" data-placement="right"
			data-original-title="Subject"> <i class="icon-tag icon-1x"></i> <span>Subject
			</span>
		</a></li>
		<li class="dark-nav"><span class="glow"></span> <a
			href="center.php" rel="tooltip" data-placement="right"
			data-original-title="Center"> <i class="icon-building icon-1x"></i>
				<span>Center </span>
		</a></li>
		<li class="dark-nav active"><span class="glow"></span> <a
			href="student.php" rel="tooltip" data-placement="right"
			data-original-title="Student"> <i class="icon-male icon-1x"></i>
				<span>Student </span>
		</a></li>

		<li class="dark-nav"><span class="glow"></span> <a
			href="exam.php" rel="tooltip" data-placement="right"
			data-original-title="Exam"> <i class="icon-book icon-1x"></i> <span>Exam
			</span>
		</a></li>
		<li class="dark-nav"><span class="glow"></span> <a
			href="question_add_sort.php" rel="tooltip" data-placement="right"
			data-original-title="Question"> <i
				class="icon-question-sign icon-1x"></i> <span>Question </span>
		</a></li>

		<li class="dark-nav"><span class="glow"></span> <a
			class="accordion-toggle  " data-toggle="collapse"
			href="#settings_submenu_first" rel="tooltip" data-placement="right"
			data-original-title="Settings"> <i class="icon-cogs icon-1x"></i>
				<span>Settings <i class="icon-caret-down"></i></span>
		</a>

			<ul id="settings_submenu_first" class="collapse">
				<li class=""><a href="general_setting.php"> <i
						class="icon-wrench"></i>&nbsp;General Settings
				</a></li>
				<li class=""><a href="user.php"><i class="icon-user"></i>&nbsp;User</a>
				</li>
			</ul></li>
		<li><span class="glow"></span> <a href="notice.php" rel="tooltip"
			data-placement="right" data-original-title="Notice"> <i
				class="icon-list-ol icon-1x"></i> <span>Notice </span>
		</a></li>
		<li><span class="glow"></span> <a href="selectresult.php"
			rel="tooltip" data-placement="right"
			data-original-title="View Result"> <i class="icon-trophy icon-1x"></i>
				<span>View Result </span>
		</a></li>


	</ul>

</div>