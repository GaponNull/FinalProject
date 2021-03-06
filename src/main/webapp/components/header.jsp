<script href="../js/header.js"></script>
<nav class="navbar navbar-default navbar-expand-lg navbar-light">
    <div class="navbar-header d-flex col">
        <a class="navbar-brand" href="#">Brand<b>Name</b></a>
        <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle navbar-toggler ml-auto">
            <span class="navbar-toggler-icon"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
    </div>
    <div id="navbarCollapse" class="collapse navbar-collapse justify-content-start">
        <ul class="nav navbar-nav">
            <li class="nav-item"><a href="#" class="nav-link">Home</a></li>
            <li class="nav-item"><a href="#" class="nav-link">About</a></li>
            <li class="nav-item dropdown">
                <a data-toggle="dropdown" class="nav-link dropdown-toggle" href="#">Services <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="#" class="dropdown-item">Web Design</a></li>
                    <li><a href="#" class="dropdown-item">Web Development</a></li>
                    <li><a href="#" class="dropdown-item">Graphic Design</a></li>
                    <li><a href="#" class="dropdown-item">Digital Marketing</a></li>
                </ul>
            </li>
            <li class="nav-item active"><a href="#" class="nav-link">Pricing</a></li>
            <li class="nav-item"><a href="#" class="nav-link">Blog</a></li>
            <li class="nav-item"><a href="#" class="nav-link">Contact</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right ml-auto">
            <li class="nav-item">
                <a data-toggle="dropdown" class="nav-link dropdown-toggle" href="#">Login</a>
                <ul class="dropdown-menu form-wrapper">
                    <li>
                        <form action="/examples/actions/confirmation.php" method="post">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Username" required="required">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="Password" required="required">
                            </div>
                            <input type="submit" class="btn btn-primary btn-block" value="Login">
                        </form>
                    </li>
                </ul>
            </li>
            <li class="nav-item">
                <a href="#" data-toggle="dropdown" class="btn btn-primary dropdown-toggle get-started-btn mt-1 mb-1">Sign up</a>
                <ul class="dropdown-menu form-wrapper">
                    <li>
                        <form action="/examples/actions/confirmation.php" method="post">
                            <p class="hint-text">Fill in this form to create your account!</p>
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Username" required="required">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="Password" required="required">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" placeholder="Confirm Password" required="required">
                            </div>
                            <div class="form-group">
                                <label class="checkbox-inline"><input type="checkbox" required="required"> I accept the <a href="#">Terms &amp; Conditions</a></label>
                            </div>
                            <input type="submit" class="btn btn-primary btn-block" value="Sign up">
                        </form>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</nav>