import * as React from "react";
import jsonServerProvider from 'ra-data-json-server';
import { Admin, Resource } from 'react-admin';
import { MotorList } from './motor';
import { MotoList } from './moto';

const dataProvider = jsonServerProvider('http://localhost:8080');
const App = () => (
    <Admin dataProvider={dataProvider}>
        <Resource name="moto" list={MotoList} />
        <Resource name="motor" list={MotorList} />
    </Admin>
);

export default App;