import React from 'react';
import { Container } from 'reactstrap';

export default function Header(props) {
    return (
        <div className="full-width header vertical-center">
            <Container>
                <div className="vertical-center justify-content-center">
                    <h1 className="tco-text-upper"> t66 Chess Application</h1>
                </div>
            </Container>
        </div>
    );
}